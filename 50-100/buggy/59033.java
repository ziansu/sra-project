@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0)
        return new ck.kbcv.fragments.WelcomeEquationsFragment();
    else
        if (position == 1)
            return new ck.kbcv.fragments.WelcomePrecedencesFragment();
        else
            if (position == 2)
                return new ck.kbcv.fragments.WelcomeCompletionFragment();
            else
                return null;
            
        
    
}