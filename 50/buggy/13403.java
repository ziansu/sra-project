public void removeCurrency(java.lang.String from, java.lang.String to) {
    try {
        gr.kzps.id2212.conv.entities.Currency attached = findByCur(from, to);
        em.remove(attached);
    } catch (gr.kzps.id2212.conv.exceptions.ResultNotFound ex) {
    }
}