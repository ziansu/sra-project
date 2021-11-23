@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (savedInstanceState == null) {
        return ;
    }
    mConvertToDecimal = savedInstanceState.getBoolean(es.uniovi.imovil.fcrtrainer.digitalinformation.FloatingPointExerciseFragment.STATE_CONVERT_TO_DECIMAL);
    mDecimalValueF = savedInstanceState.getFloat(es.uniovi.imovil.fcrtrainer.digitalinformation.FloatingPointExerciseFragment.STATE_DECIMAL_VALUE_F);
    if (mConvertToDecimal) {
        prepareConvertToDecimalView();
        showDecimalViews();
    }else {
        computeBitRepresentation();
        prepareConvertToBinarylView();
        showBinaryViews();
    }
}