@java.lang.Override
public int getItemCount() {
    if ((stateVM) == null)
        return super.getItemCount();
    
    final int state = stateVM.getState();
    switch (state) {
        case com.ray.mvvm.lib.widget.anotations.PageState.EMPTY :
        case com.ray.mvvm.lib.widget.anotations.PageState.ERROR :
        case com.ray.mvvm.lib.widget.anotations.PageState.LOADING :
            return 1;
        default :
        case com.ray.mvvm.lib.widget.anotations.PageState.CONTENT :
        case com.ray.mvvm.lib.widget.anotations.PageState.LOAD_MORE :
            return (super.getItemCount()) + 1;
    }
}