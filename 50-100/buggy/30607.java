slm2015.hey.view.tabs.post.PostStepFragment getPostStepFragment(int position) {
    if ((postStepFragments) == null) {
        postStepFragments = new java.util.ArrayList<>();
        for (slm2015.hey.core.term.TermType type : this.types) {
            slm2015.hey.view.tabs.post.PostStepFragment fragment = slm2015.hey.view.tabs.post.PostStepFragment.newInstance(wizard, this.termLoader, type);
            fragment.setOnStepFinishListener(this.opStepFinishListener);
            postStepFragments.add(fragment);
        }
        previewFragment = slm2015.hey.view.tabs.post.PreviewFragment.newInstance(issue, wizard);
        previewFragment.setOnPreviewFinishListener(this.onPreviewFinishListener);
    }
    return postStepFragments.get(position);
}