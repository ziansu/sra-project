@java.lang.Override
public void onBindViewHolder(final library.tebyan.com.teblibrary.adapter.QuestionAdapter.ViewHolder holder, final int position) {
    library.tebyan.com.teblibrary.model.BookerQuestion question = items.get(position);
    holder.questionTxt.setText(question.getQuestion());
    holder.questionTxt.setTag(question.getQuestionID());
    holder.questionTxt.setOnClickListener(this);
    holder.answerTxt.setText(question.getAnswer());
    holder.showAnswer.setOnClickListener(this);
    holder.showAnswer.setTag(holder.answerLayout);
}