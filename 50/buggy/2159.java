@java.lang.Override
public java.lang.StringBuffer format(long value, java.lang.StringBuffer buffer, java.text.FieldPosition field) {
    return buffer.append(mElapsedTimeFormatter.format((value - (mZeroTimestamp))));
}