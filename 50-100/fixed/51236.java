public void atirarFlecha(Dwarf dwarf) {
    boolean temFlecha = (getFlecha().getQuantidade()) > 0;
    if (temFlecha) {
        getFlecha().setQuantidade(((getFlecha().getQuantidade()) - 1));
        perderVida();
        experiencia += 3;
        dwarf.perderVida();
    }
}