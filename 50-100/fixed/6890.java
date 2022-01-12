@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((weightPrevLength) > (s.length())) {
        com.kq.liftplusone.models.ExerciseSet set = mSets.get(position);
        set.setWeight(((s.length()) > 0 ? java.lang.Float.parseFloat(s.toString()) : 0));
        mSets.set(position, set);
    }
}