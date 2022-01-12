@cz.muni.fi.pa165.controller.RequestMapping(value = "/new", method = RequestMethod.GET)
public java.lang.String newLoan(@cz.muni.fi.pa165.controller.RequestParam(required = false)
java.lang.Long bookId, @cz.muni.fi.pa165.controller.RequestParam(required = false)
java.lang.Long memberId, org.springframework.ui.Model model) {
    if (bookId != null) {
        cz.muni.fi.pa165.controller.BookDTO book = bookFacade.findById(bookId);
        model.addAttribute("book", book);
    }
    if (memberId != null) {
        cz.muni.fi.pa165.controller.MemberDTO member = memberFacade.findById(memberId);
        model.addAttribute("member", member);
    }
    model.addAttribute("createLoan", new cz.muni.fi.pa165.controller.CreateLoanDTO());
    return "loan/new";
}