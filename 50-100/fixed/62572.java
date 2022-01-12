@java.lang.Override
public int get(int index) throws com.jukusoft.am.interpreter.exception.AMMainMemoryException {
    index = index - 1;
    if ((this.memory.size()) > index) {
        int value = this.memory.get(index);
        return value;
    }else {
        throw new com.jukusoft.am.interpreter.exception.AMMainMemoryException((((("memory only contains " + (memory.size())) + " elements, so index ") + index) + " is invalide."));
    }
}