private void clear(android.animation.Animator animator) {
    animator.removeListener(this);
    if ((animators) != null) {
        for (android.animation.Animator an : animators) {
            if (com.jenshen.awesomeanimation.util.animator.AnimatorUtil.equalsAnimators(animator, an)) {
                an.removeListener(this);
                animators.remove(an);
                return ;
            }
        }
    }
}