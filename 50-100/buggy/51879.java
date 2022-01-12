public void removerCarro(int id) {
    for (controller.ControllerCarro c : carros) {
        if ((c.getId()) == id) {
            try {
                carros.remove(c);
            } catch (java.util.ConcurrentModificationException ex) {
                removerCarro(id);
                java.lang.System.out.println((("carro " + id) + " foi removido"));
            }
        }
    }
}