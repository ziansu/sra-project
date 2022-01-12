public void click_b(android.view.View view) {
    if ((count) == 1)
        (count)++;
    
    if ((answer) == 2) {
        m_tv_check_b0.setVisibility(View.VISIBLE);
        m_tv_check_b1.setVisibility(View.GONE);
        m_radio_b.setBackgroundColor(Color.GREEN);
        if ((count) == 1) {
            (tw.edu.ncku.igem.eduncku.QA.correct_question_number)++;
        }
    }else {
        m_tv_check_b0.setVisibility(View.GONE);
        m_tv_check_b1.setVisibility(View.VISIBLE);
        m_radio_b.setBackgroundColor(Color.RED);
    }
}