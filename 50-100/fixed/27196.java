@java.lang.Override
public boolean hasNext() {
    return (((result) != null) && ((result.size()) == (pageSize))) || (((input.getStart()) + 1) < (input.getData().size()));
}