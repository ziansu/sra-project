@java.lang.Override
void delete() {
    size = -1;
    memory.free();
    memory = null;
    deleted = true;
}