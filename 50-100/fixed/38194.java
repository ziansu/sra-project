@java.lang.Override
public void undo(android.text.Editable editable) {
    editable.replace(after.start, ((after.start) + (after.changedText.length())), before.getChangedText());
    for (io.github.mthli.knife.history.SpanRecord beforeSpanRecord : before.spanRecordList) {
        editable.setSpan(beforeSpanRecord.span, beforeSpanRecord.start, beforeSpanRecord.end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    }
}