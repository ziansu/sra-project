@java.lang.Override
public void flush() {
    page.getByteBuffer().position(ru.spbau.mit.memory.page.InnerNodePageImpl.CHILDREN_OFFSET);
    for (int i = 0; i < ((getSize()) + 1); i++) {
        page.getByteBuffer().putInt(getChildren()[i]);
    }
    super.flush();
}