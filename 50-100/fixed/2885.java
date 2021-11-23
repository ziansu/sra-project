@java.lang.Override
public boolean insert(int index, int value) throws java.lang.IndexOutOfBoundsException {
    if (index >= ((getSize()) + 1)) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    pl.sdacaemy.data.structures.impl.ForwardList.Node newElement = new pl.sdacaemy.data.structures.impl.ForwardList.Node(value);
    if ((head) == null) {
        head = newElement;
        return true;
    }
    pl.sdacaemy.data.structures.impl.ForwardList.Node previous = getItemNode((index - 1));
    newElement.next = previous.next;
    previous.next = newElement;
    return true;
}