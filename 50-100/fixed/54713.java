@org.springframework.web.bind.annotation.RequestMapping(value = "/clima")
public com.example.model.Prediccion clima(@org.springframework.web.bind.annotation.RequestParam(value = "dia")
java.lang.String dia) {
    try {
        int d = java.lang.Integer.valueOf(dia).intValue();
        com.example.model.Prediccion p = repository.findByDia((d % (ciclo)));
        p.setDia(d);
        return p;
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("El parametro que estas pasando como dia no es valido.");
    }
}