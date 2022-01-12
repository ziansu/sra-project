@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    updateItem(getAdapterPosition());
    es.usc.citius.servando.calendula.database.DB.medicines().fireEvent();
}