@java.lang.Override
protected void onPostExecute(com.example.abdullahkucuk.fruittuin.Enumerations.WindDirection windDirection) {
    if (windDirection == (com.example.abdullahkucuk.fruittuin.Enumerations.WindDirection.UNKNOWN)) {
        android.widget.Toast.makeText(promptWindDirectionFragment.getContext(), "Ik heb je niet verstaan, typ je zin anders!", Toast.LENGTH_LONG).show();
        return ;
    }
    com.example.abdullahkucuk.fruittuin.Services.Weather weather = new com.example.abdullahkucuk.fruittuin.Services.Weather(promptWindDirectionFragment.getContext(), "Amsterdam");
    switch (windDirection) {
        case weather.getRoughWindDirection() :
            showImageQuiz();
            break;
        default :
            android.widget.Toast.makeText(promptWindDirectionFragment.getContext(), "De wind komt van een andere kant, probeer opnieuw!", Toast.LENGTH_LONG).show();
            return ;
    }
}