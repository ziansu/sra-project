@java.lang.Override
public int getOffset(int key) {
    return (key < (_minkey)) || ((key - (_minkey)) >= (_offsets.length)) ? -1 : _offsets[(key - (_minkey))];
}