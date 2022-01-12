private void sair(java.lang.String usuario, java.lang.String strData) throws java.io.IOException {
    pod.Servidor.usuarios.get(usuario).getDataOutput().writeUTF(("bye" + strData));
    informaSaida(usuario, strData);
    this.socket.close();
    pod.Servidor.usuarios.remove(usuario);
}