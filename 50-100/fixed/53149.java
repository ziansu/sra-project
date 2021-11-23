public void click_c(android.view.View view) {
    (count)++;
    if ((answer) == 3) {
        m_tv_check_c0.setVisibility(View.VISIBLE);
        m_tv_check_c1.setVisibility(View.GONE);
        m_radio_c.setBackgroundColor(Color.GREEN);
        if ((count) == 1) {
            (tw.edu.ncku.igem.eduncku.QA.correct_question_number)++;
        }
    }else {
        m_tv_check_c0.setVisibility(View.GONE);
        m_tv_check_c1.setVisibility(View.VISIBLE);
        m_radio_c.setBackgroundColor(Color.RED);
    }
}