@org.springframework.web.bind.annotation.RequestMapping(value = "/tarefa/{id}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public org.springframework.http.ResponseEntity<br.edu.ifsp.dsw.model.Tarefa> removerTarefa(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Integer id) {
    java.lang.System.out.println(("Buscando e removendo a tarefa de id " + id));
    br.edu.ifsp.dsw.model.Tarefa tarefa = tarefaService.buscarPorId(java.lang.Long.valueOf(id));
    if (tarefa == null) {
        java.lang.System.out.println((("Não é possivel deletar a tarefa de id: " + id) + " - a mesma não foi encontrada.."));
        return new org.springframework.http.ResponseEntity<br.edu.ifsp.dsw.model.Tarefa>(org.springframework.http.HttpStatus.NOT_FOUND);
    }
    tarefaService.removerTarefa(java.lang.Long.valueOf(id));
    return new org.springframework.http.ResponseEntity<br.edu.ifsp.dsw.model.Tarefa>(org.springframework.http.HttpStatus.NO_CONTENT);
}