@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    android.view.View delete = itemView.findViewById(R.id.xlist_delete_button);
    delete.setVisibility(View.INVISIBLE);
    itemView.animate().setListener(null);
}