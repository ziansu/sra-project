@java.lang.Override
public void run() {
    for (int i = comeco; i < (fim); i++) {
        synchronized(mensagens) {
            mensagens.add(("Mensagem " + i));
        }
    }
}