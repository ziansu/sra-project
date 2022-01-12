@org.springframework.transaction.annotation.Transactional
@org.springframework.web.bind.annotation.RequestMapping(value = "/excluir", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.TEXT_PLAIN_VALUE)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public void excluir(@org.springframework.web.bind.annotation.RequestBody
java.lang.String id, javax.servlet.http.HttpServletResponse response) {
    br.com.empilhatetra.domain.Peca p = repository.getEntityManager().find(br.com.empilhatetra.domain.Peca.class, java.lang.Integer.parseInt(id));
    if (p == null) {
        response.setStatus(HttpStatus.NO_CONTENT.value());
        return ;
    }
    p.excluir();
}