@org.python.Method(__doc__ = "get an index of any byte from bytes", args = { "sub" }, default_args = { "start" , "end" })
public org.python.types.Int index(org.python.types.org.python.Object sub, org.python.types.org.python.Object start, org.python.types.org.python.Object end) {
    org.python.types.Int pos = this.find(sub, start, end);
    if (pos.equals((-1))) {
        throw new org.python.types.ValueError("subsection not found");
    }
    return pos;
}