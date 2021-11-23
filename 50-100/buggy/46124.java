public void click_a(android.view.View view) {
    if ((count) == 0)
        (count)++;
    
    if ((answer) == 1) {
        m_tv_check_a0.setVisibility(View.VISIBLE);
        m_tv_check_a1.setVisibility(View.GONE);
        m_radio_a.setBackgroundColor(Color.GREEN);
        if ((count) == 1) {
            (tw.edu.ncku.igem.eduncku.QA.correct_question_number)++;
        }
    }else {
        m_tv_check_a0.setVisibility(View.GONE);
        m_tv_check_a1.setVisibility(View.VISIBLE);
        m_radio_a.setBackgroundColor(Color.RED);
    }
}