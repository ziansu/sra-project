@org.springframework.web.bind.annotation.RequestMapping(path = "Problema/{probID}/Teste/{testeID}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public models.Teste TesteDelete(@org.springframework.web.bind.annotation.PathVariable
int probID) {
    return Teste(probID)[0];
}