public void removerCarro(int id) {
    try {
        for (controller.ControllerCarro c : carros) {
            if ((c.getId()) == id) {
                carros.remove(c);
            }
        }
    } catch (java.util.ConcurrentModificationException ex) {
        removerCarro(id);
        java.lang.System.out.println((("carro " + id) + " foi removido"));
        (counter)--;
    }
}