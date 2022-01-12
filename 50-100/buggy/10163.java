@org.springframework.web.bind.annotation.RequestMapping(value = "/tarefa/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<br.edu.ifsp.dsw.model.Tarefa> buscarTarefa(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Integer id) {
    java.lang.System.out.println(("Buscando tarefa de id: " + id));
    br.edu.ifsp.dsw.model.Tarefa tarefa = tarefaService.buscarPorId(id.longValue());
    if (tarefa == null) {
        java.lang.System.out.println((("Tarefa de id :" + id) + " nao foi encontrada."));
        return new org.springframework.http.ResponseEntity<br.edu.ifsp.dsw.model.Tarefa>(org.springframework.http.HttpStatus.NOT_FOUND);
    }
    return new org.springframework.http.ResponseEntity<br.edu.ifsp.dsw.model.Tarefa>(tarefa, org.springframework.http.HttpStatus.OK);
}