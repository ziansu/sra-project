public void remove(int position) {
    mTextPartitions.remove(position);
    boolean bIsRemoveCurSpritzLastItem = ((m_nCurSelectedPartitionIdx) == position) && (position == ((mTextPartitions.size()) - 1));
    if (((m_nCurSelectedPartitionIdx) > position) || bIsRemoveCurSpritzLastItem) {
        m_nCurSelectedPartitionIdx -= 1;
    }
    notifyDataSetChanged();
}