@org.springframework.web.bind.annotation.RequestMapping(value = "/responsable/addProjet", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
public fr.norsys.fondation.entities.Projet addProjet(@org.springframework.web.bind.annotation.RequestBody
fr.norsys.fondation.entities.Projet projet) {
    fr.norsys.fondation.entities.Projet storedProject = this.projetService.addProjet(projet);
    for (fr.norsys.fondation.entities.Partenaire partenaire : projet.getPartenaires()) {
        partenaire.getProjets().add(projet);
        this.partenaireService.updatePartenaire(partenaire);
    }
    return storedProject;
}