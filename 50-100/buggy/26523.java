@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((repsPrevLength) > (s.length())) {
        com.kq.liftplusone.models.ExerciseSet set = mSets.get(position);
        set.setReps(java.lang.Integer.parseInt(s.toString()));
        mSets.set(position, set);
    }
}