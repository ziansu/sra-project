@java.lang.Override
public rx.Observable<io.pumpkinz.pumpkinreader.model.Comment> call(io.pumpkinz.pumpkinreader.model.Comment comment) {
    return getInnerComments((level + 1), comment);
}