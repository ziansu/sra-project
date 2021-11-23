@java.lang.Override
public org.unicef.rapidreg.widgets.viewholder.BaseViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    switch (viewType) {
        case org.unicef.rapidreg.childcase.CaseRegisterAdapter.GENERIC_VIEW_HOLDER :
            return new org.unicef.rapidreg.widgets.viewholder.GenericViewHolder(context, inflater.inflate(resources.getIdentifier(CaseField.TYPE_TEXT_FIELD, "layout", packageName), null));
        case org.unicef.rapidreg.childcase.CaseRegisterAdapter.TICK_BOX_VIEW_HOLDER :
            return new org.unicef.rapidreg.widgets.viewholder.TickBoxViewHolder(context, inflater.inflate(resources.getIdentifier(CaseField.TYPE_TICK_BOX, "layout", packageName), null));
        default :
            return new org.unicef.rapidreg.widgets.viewholder.SeparatorViewHolder(context, new android.view.View(context));
    }
}