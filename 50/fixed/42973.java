public static void abrirPorta(int veloc) {
    Emitter.send(false, ((veloc << 1) | 1), 3);
}