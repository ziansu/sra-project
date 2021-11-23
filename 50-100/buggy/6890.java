@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((weightPrevLength) > (s.length())) {
        com.kq.liftplusone.models.ExerciseSet set = mSets.get(position);
        set.setWeight(java.lang.Float.parseFloat(s.toString()));
        mSets.set(position, set);
    }
}