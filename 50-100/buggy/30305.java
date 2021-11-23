@java.lang.Override
public DataType getData() {
    if ((this.data) == null) {
        try (java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(this.buffer)) {
            try (java.io.ObjectInput in = new java.io.ObjectInputStream(bis)) {
                this.data = ((DataType) (in.readObject()));
            }
        } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    return this.data;
}