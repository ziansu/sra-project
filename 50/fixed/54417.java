@java.lang.Override
public void onClick(android.view.View v) {
    if ((check_if_SVM_params_set()) == false)
        return ;
    
    if ((is_svm_has_been_intialized) == false)
        initSVM();
    
    if ((is_cropped) && (is_svm_has_been_intialized))
        predict_this_picture();
    
}