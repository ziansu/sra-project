@java.lang.Override
public void onClick(android.view.View view) {
    if ((view.getId()) == (R.id.btnNext)) {
        if (((mQuestions.size()) - 1) <= (mPageIndex))
            return ;
        
        nextQuestion();
        loadQuestion();
    }else
        if ((view.getId()) == (R.id.btnPrevious)) {
            if (((mQuestions.size()) - 1) <= (mPageIndex))
                return ;
            
            previousQuestion();
            loadQuestion();
        }
    
}