@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    m_CurrentValue = s.toString();
    m_CurrentPosition = position;
    m_CurrentLineNetAmt = tv_LineNetAmt;
    m_CurrentRecordItem = recordItem;
}