int getRecyclerViewPosition(de.oerntec.votenote.Database.Pojo.AdmissionPercentageData item) {
    int listPosition;
    for (listPosition = 0; listPosition < (mData.size()); listPosition++) {
        de.oerntec.votenote.Database.Pojo.AdmissionPercentageData apd = mData.get(listPosition);
        if (((apd.lessonId) == (item.lessonId)) && ((apd.admissionPercentageMetaId) == (item.admissionPercentageMetaId)))
            break;
        
    }
    return listPosition + 1;
}