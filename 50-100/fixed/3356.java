@java.lang.Override
public boolean equals(java.lang.Object obj) {
    Core.Hospedagem h = ((Core.Hospedagem) (obj));
    return ((h.cidadeDestino.equals(cidadeDestino)) && (h.nomeHotel.equals(nomeHotel))) && ((h.preco) == (preco));
}