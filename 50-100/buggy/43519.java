public void next(android.view.View view) {
    (tw.edu.ncku.igem.eduncku.QA.question_number)++;
    if ((tw.edu.ncku.igem.eduncku.QA.question_number) <= (the_number_of_question)) {
        android.content.Intent intent = new android.content.Intent(this, tw.edu.ncku.igem.eduncku.QA.class);
        intent.putExtra("answer", tw.edu.ncku.igem.eduncku.QA.answer_array[((tw.edu.ncku.igem.eduncku.QA.question_number) - 1)]);
        startActivity(intent);
        finish();
    }else {
        finish();
    }
}