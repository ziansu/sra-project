@org.springframework.web.bind.annotation.RequestMapping(value = "/sample2")
public java.lang.String sample2(org.springframework.ui.Model model) {
    java.lang.System.out.println("Detectada peticion para ir a sample2");
    java.util.List<es.unizar.es.foodnet.model.entity.Producto> productos = repository.findAll();
    model.addAttribute("listica", productos);
    model.addAttribute("producttype", "new");
    model.addAttribute("productObject", new es.unizar.es.foodnet.model.entity.Producto());
    return "sample2";
}