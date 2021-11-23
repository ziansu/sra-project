private void updatePickers() {
    android.util.Log.d("KG: updatePickers:", "");
    for (com.hornet.dateconverter.DatePicker.DatePickerDialog.OnDateChangedListener listener : mListeners)
        listener.onDateChanged();
    
}