@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.LayoutInflater myInflater = android.view.LayoutInflater.from(getContext());
    android.view.View customView = myInflater.inflate(R.layout.activity_home_question, parent, false);
    com.example.kaiwang.answerbot.Questions plQuestion = getItem(position);
    android.widget.TextView MainQuestion = ((android.widget.TextView) (customView.findViewById(R.id.qquestion)));
    java.lang.String question = plQuestion.question_body;
    MainQuestion.setText(question);
    return customView;
}