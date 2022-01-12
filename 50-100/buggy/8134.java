@cz.muni.fi.pa165.controller.RequestMapping(value = "/new", method = RequestMethod.GET)
public java.lang.String newLoan(@cz.muni.fi.pa165.controller.RequestParam(defaultValue = "0")
long bookId, @cz.muni.fi.pa165.controller.RequestParam(defaultValue = "0")
long memberId, org.springframework.ui.Model model) {
    if (bookId > 0) {
        cz.muni.fi.pa165.controller.BookDTO book = bookFacade.findById(bookId);
        model.addAttribute("book", book);
    }
    if (memberId > 0) {
        cz.muni.fi.pa165.controller.MemberDTO member = memberFacade.findById(memberId);
        model.addAttribute("member", member);
    }
    model.addAttribute("createLoan", new cz.muni.fi.pa165.controller.CreateLoanDTO());
    return "loan/new";
}