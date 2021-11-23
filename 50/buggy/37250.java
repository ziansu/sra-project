@org.springframework.web.bind.annotation.RequestMapping(path = "Solucao/{solID}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public models.Solucao SolucaoDelete(@org.springframework.web.bind.annotation.PathVariable
int solID) {
    return Solucao(false);
}