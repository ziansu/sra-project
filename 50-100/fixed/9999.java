@java.lang.Override
public void store() {
    try (java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream()) {
        try (java.io.ObjectOutput out = new java.io.ObjectOutputStream(bos)) {
            out.writeObject(this.getData());
            this.buffer = bos.toByteArray();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    super.store();
}