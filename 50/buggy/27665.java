@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String jasonFromFile = readSavedData();
    com.google.gson.Gson json = new com.google.gson.Gson();
    com.petrsu.cardiacare.smartcarequestionnaire.Questionnaire qst = json.fromJson(jasonFromFile, com.petrsu.cardiacare.smartcarequestionnaire.Questionnaire.class);
    com.petrsu.cardiacare.smartcarequestionnaire.MainActivity.questionnaire = qst;
    printQuestionnaire(com.petrsu.cardiacare.smartcarequestionnaire.MainActivity.questionnaire);
}