@org.springframework.web.bind.annotation.RequestMapping(value = "/completionDateValidate.json", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public org.orcid.pojo.ajaxForm.PeerReviewForm validateCompletionDate(@org.springframework.web.bind.annotation.RequestBody
org.orcid.pojo.ajaxForm.PeerReviewForm peerReview) {
    peerReview.getCompletionDate().setErrors(new java.util.ArrayList<java.lang.String>());
    if ((!(org.orcid.pojo.ajaxForm.PojoUtil.isEmpty(peerReview.getCompletionDate().getMonth()))) && (org.orcid.pojo.ajaxForm.PojoUtil.isEmpty(peerReview.getCompletionDate().getYear()))) {
        setError(peerReview.getCompletionDate(), "common.dates.invalid");
    }
    return peerReview;
}