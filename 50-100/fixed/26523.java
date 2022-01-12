@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (((repsPrevLength) > (s.length())) && ((s.length()) > 0)) {
        com.kq.liftplusone.models.ExerciseSet set = mSets.get(position);
        set.setReps(((s.length()) > 0 ? java.lang.Integer.parseInt(s.toString()) : 0));
        mSets.set(position, set);
    }
}