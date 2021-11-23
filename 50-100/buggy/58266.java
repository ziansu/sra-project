public void clone(bean.CommandeItem commandeItemSource, bean.CommandeItem commandeItemDestination) {
    commandeItemDestination.setCommande(commandeItemSource.getCommande());
    commandeItemDestination.setId(commandeItemSource.getId());
    commandeItemDestination.setPlatMenu(commandeItemSource.getPlatMenu());
    commandeItemDestination.setPrixTotalItem(commandeItemSource.getPrixTotalItem());
    commandeItemDestination.setQte(commandeItemSource.getQte());
    commandeItemDestination.setSupplementSelecteds(commandeItemSource.getSupplementSelecteds());
}